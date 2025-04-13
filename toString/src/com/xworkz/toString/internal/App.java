package com.xworkz.toString.internal;

public class App {
    private String appName;
    private String developer;
    private double version;

    public App(String appName, String developer, double version) {
        this.appName = appName;
        this.developer = developer;
        this.version = version;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName + '\'' +
                ", developer='" + developer + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof App) {
                App app1 = this;
                App app2 = (App) obj;
                if (app1.appName.equals(app2.appName) && app1.developer.equals(app2.developer) && app1.version == app2.version) {
                    return true;
                }
            }
        }
        return false;
    }
}
