package edu.upb.practiceapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Adding my 7 markers of my favorite places ever visited :)

        // Gwangali beach - Busan
        LatLng m1 = new LatLng(35.153714, 129.118540);
        mMap.addMarker(new MarkerOptions().position(m1).title("Gwangali Beach (Lover's Beach) - GKS 2019").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk1)));
        // Goethe Institut Sao Paulo - Brazil
        LatLng m2 = new LatLng(-23.555772, -46.681835);
        mMap.addMarker(new MarkerOptions().position(m2).title("Girl Games 2018 - Goethe Institut").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk2)));
        // University of Virginia - Charlottesville
        LatLng m3 = new LatLng(38.034244, -78.504758);
        mMap.addMarker(new MarkerOptions().position(m3).title("University of Virginia - Youth Ambassadors 2013").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk3)));
        // Pensacola Beach - Florida
        LatLng m4 = new LatLng(30.333602, -87.141414);
        mMap.addMarker(new MarkerOptions().position(m4).title("Pensacola Beach - Youth Ambassadors 2013").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk4)));
        // Los Angeles International Airport
        LatLng m5 = new LatLng(33.941969, -118.406849);
        mMap.addMarker(new MarkerOptions().position(m5).title("LAX Airport").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk5)));
        // Incheon International Airport
        LatLng m6 = new LatLng(37.448604, 126.451107);
        mMap.addMarker(new MarkerOptions().position(m6).title("Incheon International Airport").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk6)));
        // My house
        LatLng m7 = new LatLng(-16.538656, -68.046152);
        mMap.addMarker(new MarkerOptions().position(m7).title("My House").icon(BitmapDescriptorFactory.fromResource(R.drawable.mrk7)));


        // Move Camera to House Marker
        mMap.moveCamera(CameraUpdateFactory.newLatLng(m7));
    }
}
