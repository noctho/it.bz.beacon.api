package it.bz.beacon.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import it.bz.beacon.api.db.model.BeaconData;
import it.bz.beacon.api.model.enumeration.LocationType;
import it.bz.beacon.api.model.enumeration.Status;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beacon {

    private long id;
    private Manufacturer manufacturer;
    private String manufacturerId;
    private String name;
    private String description;
    private float lat;
    private float lng;
    private LocationType locationType;
    private String locationDescription;
    private Status status;
    private long lastSeen;
    private long lastUpdated;

    private boolean iBeacon;
    private boolean eddystone;
    private boolean eddystoneUrl;
    //etc

    private UUID uuid;
    private int major;
    private int minor;

    private String url;
    private String namespace;
    private String instanceId;

    private int interval;
    private int txPower;

    private int batteryLevel;

    public static Beacon fromRemoteBeacon(BeaconData beaconData, RemoteBeacon remoteBeacon) {
        Beacon beacon = new Beacon();
        beacon.setId(beaconData.getId());
        beacon.setManufacturer(beaconData.getManufacturer());
        beacon.setManufacturerId(beaconData.getManufacturerId());
        beacon.setLat(beaconData.getLat());
        beacon.setLng(beaconData.getLng());
        beacon.setName(beaconData.getName());
        beacon.setDescription(beaconData.getDescription());

        if (remoteBeacon != null) {
            beacon.setUuid(remoteBeacon.getUuid());
            beacon.setMajor(remoteBeacon.getMajor());
            beacon.setMinor(remoteBeacon.getMinor());
            beacon.setUrl(remoteBeacon.getUrl());
            beacon.setNamespace(remoteBeacon.getNamespace());
            beacon.setInstanceId(remoteBeacon.getInstanceId());
            beacon.setInterval(remoteBeacon.getInterval());
            beacon.setTxPower(remoteBeacon.getTxPower());
            beacon.setBatteryLevel(remoteBeacon.getBatteryLevel());
        }

        return beacon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getTxPower() {
        return txPower;
    }

    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
