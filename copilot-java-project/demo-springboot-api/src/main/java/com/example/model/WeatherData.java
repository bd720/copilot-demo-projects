package com.example.model;
    //create a model class for json example : {"location":{"name":"Boston","region":"Lincolnshire","country":"United Kingdom","lat":53.1,"lon":-0.13,"tz_id":"Europe/London","localtime_epoch":1682323757,"localtime":"2023-04-24 9:09"},"current":{"last_updated_epoch":1682323200,"last_updated":"2023-04-24 09:00","temp_c":6.0,"temp_f":42.8,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":15.0,"wind_kph":24.1,"wind_degree":310,"wind_dir":"NW","pressure_mb":1008.0,"pressure_in":29.77,"precip_mm":0.0,"precip_in":0.0,"humidity":81,"cloud":50,"feelslike_c":1.7,"feelslike_f":35.0,"vis_km":10.0,"vis_miles":6.0,"uv":2.0,"gust_mph":21.7,"gust_kph":34.9}}

public class WeatherData {
    //create location class
    public class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;
        private int localtime_epoch;
        private String localtime;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getRegion() {
            return region;
        }
        public void setRegion(String region) {
            this.region = region;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public double getLat() {
            return lat;
        }
        public void setLat(double lat) {
            this.lat = lat;
        }
        public double getLon() {
            return lon;
        }
        public void setLon(double lon) {
            this.lon = lon;
        }
        public String getTz_id() {
            return tz_id;
        }
        public void setTz_id(String tz_id) {
            this.tz_id = tz_id;
        }
        public int getLocaltime_epoch() {
            return localtime_epoch;
        }
        public void setLocaltime_epoch(int localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }
        public String getLocaltime() {
            return localtime;
        }
        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }
        @Override
        public String toString() {
            return "Location [country=" + country + ", lat=" + lat + ", localtime=" + localtime + ", localtime_epoch="
                    + localtime_epoch + ", lon=" + lon + ", name=" + name + ", region=" + region + ", tz_id=" + tz_id
                    + "]";
        }
        
    }
    //create current class
    public class Current {
        private int last_updated_epoch;
        private String last_updated;
        private double temp_c;
        private double temp_f;
        private int is_day;
        private Condition condition;
        private double wind_mph;
        private double wind_kph;
        private int wind_degree;
        private String wind_dir;
        private double pressure_mb;
        private double pressure_in;
        private double precip_mm;
        private double precip_in;
        private int humidity;
        private int cloud;
        private double feelslike_c;
        private double feelslike_f;
        private double vis_km;
        private double vis_miles;
        private double uv;
        private double gust_mph;
        private double gust_kph;
        public int getLast_updated_epoch() {
            return last_updated_epoch;
        }
        public void setLast_updated_epoch(int last_updated_epoch) {
            this.last_updated_epoch = last_updated_epoch;
        }
        public String getLast_updated() {
            return last_updated;
        }
        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }
        public double getTemp_c() {
            return temp_c;
        }
        public void setTemp_c(double temp_c) {
            this.temp_c = temp_c;
        }
        public double getTemp_f() {
            return temp_f;
        }
        public void setTemp_f(double temp_f) {
            this.temp_f = temp_f;
        }
        public int getIs_day() {
            return is_day;
        }
        public void setIs_day(int is_day) {
            this.is_day = is_day;
        }
        public Condition getCondition() {
            return condition;
        }
        public void setCondition(Condition condition) {
            this.condition = condition;
        }
        public double getWind_mph() {
            return wind_mph;
        }
        public void setWind_mph(double wind_mph) {
            this.wind_mph = wind_mph;
        }
        public double getWind_kph() {
            return wind_kph;
        }
        public void setWind_kph(double wind_kph) {
            this.wind_kph = wind_kph;
        }
        public int getWind_degree() {
            return wind_degree;
        }
        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
        }
        public String getWind_dir() {
            return wind_dir;
        }

        //create condition class
        public class Condition {
            private String text;
            private String icon;
            private int code;
            public String getText() {
                return text;
            }
            public void setText(String text) {
                this.text = text;
            }
            public String getIcon() {
                return icon;
            }
            public void setIcon(String icon) {
                this.icon = icon;
            }
            public int getCode() {
                return code;
            }
            public void setCode(int code) {
                this.code = code;
            }
            @Override
            public String toString() {
                return "Condition [code=" + code + ", icon=" + icon + ", text=" + text + "]";
            }
            
        }
        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }
    }
    
    private Location location;
    private Current current;
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public Current getCurrent() {
        return current;
    }
    public void setCurrent(Current current) {
        this.current = current;
    }
    @Override
    public String toString() {
        return "WeatherData [current=" + current + ", location=" + location + "]";
    }
    
}
