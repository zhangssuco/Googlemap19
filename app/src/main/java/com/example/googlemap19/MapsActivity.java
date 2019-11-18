package com.example.googlemap19;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnMarkerClickListener
{

    private GoogleMap mMap;

    private Marker myMarker;

    @Override
    public boolean onMarkerClick(final Marker marker) {
        //handle click here

        Toast.makeText(this, marker.getTitle(), Toast.LENGTH_SHORT).show(); //handle click here
        //or launch a new activity!!!
        if (marker.getSnippet().toString().equals("1"))
        {
           ;
        }
        if (marker.getSnippet().toString().equals("2"))
        {
            ;
        }
        return true;
    }

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

        googleMap.setOnMarkerClickListener(this);

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng Oneonta = new LatLng(42.4529,  -75.0638);
        //mMap.addMarker(new MarkerOptions().position(Oneonta).title("SUNY Oneonta"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Oneonta));

        LatLng Stonybrook = new LatLng(40.9257,  -73.1409);
        //mMap.addMarker(new MarkerOptions().position(Stonybrook).title("SUNY Stonybrook"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Stonybrook));

        googleMap.addMarker(new MarkerOptions()
                .position(Oneonta)
                .title("SUNY Oneonta")
                .snippet("1")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        googleMap.addMarker(new MarkerOptions()
                .position(Stonybrook)
                .title("SUNY Stonybrook")
                .snippet("2")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Oneonta));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Stonybrook));

        // add all suny campus!!! make them clickable

    }
}
