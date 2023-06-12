package com.example.mpklubartow;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.*;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.*;
import com.example.mpklubartow.databinding.ActivityMapsBinding;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Spinner spinnerFrom, spinnerTo;
    ArrayAdapter adapterFrom, adapterTo;
    private Bitmap getBitmap(int drawableRes) {
        Drawable drawable = getResources().getDrawable(drawableRes);
        Canvas canvas = new Canvas();
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);

        return bitmap;
    }
    public void create(){
        Bitmap bluebuss = getBitmap(R.drawable.bluebussstop);
        LatLng hutnicza = new LatLng(51.44699773024649, 22.614881635415134);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(hutnicza)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng kolejowa = new LatLng(51.446136984256384, 22.609384369636228);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(kolejowa)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng powstancow = new LatLng(51.45218191460669, 22.607887945076673);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(powstancow)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng cicha = new LatLng(51.45636666537752, 22.61137746636027);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(cicha)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng maja = new LatLng(51.45179222885734, 22.613586742002635);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(maja)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng piaskowa = new LatLng(51.44759018070596, 22.615072957538022);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(piaskowa)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lakowa = new LatLng(51.450905238819246, 22.623536989314648);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lakowa)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lakowa_s = new LatLng(51.456173298619646, 22.616046685934776);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lakowa_s)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng cicha_p = new LatLng(51.45624295571328, 22.610140884474852);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(cicha_p)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lubelska = new LatLng(51.45857727991599, 22.60963902971521);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lubelska)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng partyzancka = new LatLng(51.4600501067697, 22.614290833181453);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(partyzancka)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng farna = new LatLng(51.46391275504191, 22.611122445886398);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(farna)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng szaniawskiego = new LatLng(51.463419270877374, 22.605044703181093);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(szaniawskiego)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng aleje = new LatLng(51.4568247479672, 22.605637682893136);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(aleje)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng nowodworska = new LatLng(51.45568959832703, 22.59946833966021);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(nowodworska)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lipowaIII = new LatLng(51.46347388018632, 22.58393329001064);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lipowaIII)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lipowaII = new LatLng(51.46441419006786, 22.595194534281195);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lipowaII)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lipowaI = new LatLng(51.46496008939122, 22.602304267476867);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lipowaI)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng chopina = new LatLng(51.46672349456205, 22.60442771831032);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(chopina)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng jadwigi = new LatLng(51.470128731926096, 22.595701425243398);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(jadwigi)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng mieszka = new LatLng(51.474196249786345, 22.597163320966875);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(mieszka)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng kopernika = new LatLng(51.47617222660183, 22.60374845550104);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(kopernika)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng polesie = new LatLng(51.47728479796301, 22.598701590790494);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(polesie)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng polesie2 = new LatLng(51.47864792468218, 22.593541940444325);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(polesie2)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng kosmonautow = new LatLng(51.47993911158207, 22.597064777703572);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(kosmonautow)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
        LatLng lisow = new LatLng(51.480515753448884, 22.6003653537627);
        Objects.requireNonNull(mMap.addMarker(new MarkerOptions().position(lisow)
                .icon(BitmapDescriptorFactory.fromBitmap(bluebuss))));
    }

    String from;
    String to;
    int from_p;
    int to_p;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.mpklubartow.databinding.ActivityMapsBinding binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        Objects.requireNonNull(mapFragment).getMapAsync(this);

        spinnerFrom=findViewById(R.id.from);
        spinnerTo=findViewById(R.id.to);

        adapterFrom=ArrayAdapter.createFromResource(this,R.array.stops, R.layout.spinner_list);
        adapterFrom.setDropDownViewResource(R.layout.spinner_list_dropdown);

        adapterTo=ArrayAdapter.createFromResource(this,R.array.stops, R.layout.spinner_list);
        adapterTo.setDropDownViewResource(R.layout.spinner_list_dropdown);

        spinnerFrom.setAdapter(adapterFrom);
        spinnerTo.setAdapter(adapterTo);

        spinnerFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = parent.getItemAtPosition(position).toString();
                from_p = parent.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing
            }
        });

        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = parent.getItemAtPosition(position).toString();
                to_p = parent.getSelectedItemPosition();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //nothing
            }
        });

        ImageButton checkButton = findViewById(R.id.check);
        checkButton.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), ListOfBus.class);
            i.putExtra("from", from);
            i.putExtra("to", to);
            i.putExtra("from_p", from_p);
            i.putExtra("to_p", to_p);
            startActivity(i);
        });
    }

    @Override
    public void onMapReady(@NotNull GoogleMap googleMap) {
        mMap = googleMap;

        create();

        mMap.setMinZoomPreference(14);
        LatLng lubartow = new LatLng(51.460277162720395, 22.608118359493712);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lubartow));
    }
}