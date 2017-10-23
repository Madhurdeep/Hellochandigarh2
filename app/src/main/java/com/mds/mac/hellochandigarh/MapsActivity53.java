package com.mds.mac.hellochandigarh;

import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity53 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps53);
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

        // Add a marker in Sydney and move the camera
        LatLng chd = new LatLng(30.659984, 76.822030);
        LatLng chd1 = new LatLng(30.726642, 76.767492);
        LatLng chd2 = new LatLng(30.754301, 76.788280);
        LatLng chd3 = new LatLng(30.745850, 76.785276);
        LatLng chd4 = new LatLng(30.740249, 76.776375);
        LatLng chd5 = new LatLng(30.730945, 76.841463);

        mMap.addMarker(new MarkerOptions().position(chd).title("Paras DownTown Square"));
        mMap.addMarker(new MarkerOptions().position(chd1).title("JW Marriot"));
        mMap.addMarker(new MarkerOptions().position(chd2).title("Hotel Mount View"));
        mMap.addMarker(new MarkerOptions().position(chd3).title("Hotel Taj"));
        mMap.addMarker(new MarkerOptions().position(chd4).title("Hotel Shivalikview Chandigarh"));
        mMap.addMarker(new MarkerOptions().position(chd5).title("The Lalit Chandigarh"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd,11));
       mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd1,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd2,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd3,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd4,11));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chd5,11));


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
