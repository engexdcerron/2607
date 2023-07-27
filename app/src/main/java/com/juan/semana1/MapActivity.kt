package com.juan.semana1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.juan.semana1.databinding.ActivityAddCouponBinding
import com.juan.semana1.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapBinding
    private lateinit var googleMap : GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentMap = supportFragmentManager.findFragmentById(R.id.fcv_map) as SupportMapFragment
        fragmentMap.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        val idatCentroLocation = LatLng(-12.101224, -77.035919 )
        val idatSJLLocation = LatLng(-11.9986873, -77.0210552 )
        googleMap.addMarker(MarkerOptions().position(idatCentroLocation).title("Idat Centro"))
        googleMap.addMarker(MarkerOptions().position(idatSJLLocation).title("Idat San juan de Lurigancho"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatCentroLocation))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(idatSJLLocation))

    }
}