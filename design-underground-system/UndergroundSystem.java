class UndergroundSystem {
    private Map<Integer, CheckInData> checkInData;
    private Map<String, JourneyData> journeyData;

    public UndergroundSystem() { // O(1)
        this.checkInData = new HashMap<>();
        this.journeyData = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) { // O(1)
        checkInData.put(id, new CheckInData(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) { // O(N)
        CheckInData checkInDataForId = checkInData.get(id);
        String route = getRoute(checkInDataForId.stationName, stationName);
        JourneyData journeyDataForRoute = journeyData.getOrDefault(route, new JourneyData());
        
        journeyDataForRoute.totalTripTime += t - checkInDataForId.time;
        journeyDataForRoute.totalTrips++;
        journeyData.put(route, journeyDataForRoute);

        checkInData.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) { // O(N)
        String route = getRoute(startStation, endStation);
        JourneyData journeyDataForRoute = journeyData.get(route);

        return journeyDataForRoute.totalTripTime / journeyDataForRoute.totalTrips;
    }

    private String getRoute(String startStation, String endStation) { // O(N) where N is the combined station lengths
        StringBuilder route = new StringBuilder();

        route.append(startStation);
        route.append("->");
        route.append(endStation);

        return route.toString();
    }

    static class CheckInData {
        private String stationName;
        private int time;

        public CheckInData(String stationName, int time) { // O(1)
            this.stationName = stationName;
            this.time = time;
        }
    }

    static class JourneyData {
        private double totalTripTime;
        private double totalTrips;

        public JourneyData() { // O(1)
            this.totalTripTime = 0.0;
            this.totalTrips = 0.0;
        }
    }
}
