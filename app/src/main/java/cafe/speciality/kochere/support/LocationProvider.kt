package cafe.speciality.kochere.support

import android.annotation.SuppressLint
import android.content.Context
import android.location.LocationManager
import cafe.speciality.kochere.repository.model.LocationData

/**
 * Created by mateuszbratkowski on 14/01/2018.
 */
class LocationProvider constructor(context: Context) {

    private val locationManager: LocationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

    @SuppressLint("MissingPermission")
    fun requestLocation(): LocationData {
        val location = locationManager.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER)
        return LocationData(location.latitude.toString(),
                location.longitude.toString())

    }
}