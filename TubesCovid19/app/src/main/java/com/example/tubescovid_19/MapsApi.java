package com.example.tubescovid_19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsApi extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_api);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng Bandarlampung = new LatLng(-5.394143, 105.266614);
        map.addMarker(new MarkerOptions().position(Bandarlampung).title("Bandar Lampung"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bandarlampung));

        LatLng Jambi = new LatLng(-1.614552, 103.604378);
        map.addMarker(new MarkerOptions().position(Jambi).title("Jambi"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Jambi));

        LatLng Bogor = new LatLng(-6.581055, 106.796989);
        map.addMarker(new MarkerOptions().position(Bogor).title("Bogor"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bogor));

        LatLng Depok = new LatLng(-6.396370, 106.808528);
        map.addMarker(new MarkerOptions().position(Depok).title("Depok"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Depok));

        LatLng Bekasi = new LatLng(-6.256545, 106.977837);
        map.addMarker(new MarkerOptions().position(Bekasi).title("Bekasi"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bekasi));

        LatLng Tangerang = new LatLng(-6.175314, 106.643166);
        map.addMarker(new MarkerOptions().position(Tangerang).title("Tanggerang"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Tangerang));

        LatLng Tangerangselatan = new LatLng(-6.293446, 106.711059);
        map.addMarker(new MarkerOptions().position(Tangerangselatan).title("Tanggerang Selatan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Tangerangselatan));

        LatLng Pekanbaru = new LatLng(0.512760, 101.447700);
        map.addMarker(new MarkerOptions().position(Pekanbaru).title("Pekanbaru"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pekanbaru));

        LatLng Makassar = new LatLng(-5.142044, 119.459423);
        map.addMarker(new MarkerOptions().position(Makassar).title("Makassar"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Makassar));

        LatLng Jakarta = new LatLng(-6.196083, 106.832228);
        map.addMarker(new MarkerOptions().position(Jakarta).title("Jakarta"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Jakarta));

        LatLng Medan = new LatLng(3.589495, 98.670173);
        map.addMarker(new MarkerOptions().position(Medan).title("Medan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Medan));

        LatLng DeliSerdang = new LatLng(3.433330, 98.698814);
        map.addMarker(new MarkerOptions().position(DeliSerdang).title("Deli Serdang"));
        map.moveCamera(CameraUpdateFactory. newLatLng(DeliSerdang));

        LatLng TanjungBalai = new LatLng(2.963702, 99.799862);
        map.addMarker(new MarkerOptions().position(TanjungBalai).title("Tanjung Balai"));
        map.moveCamera(CameraUpdateFactory. newLatLng(TanjungBalai));

        LatLng Binjai = new LatLng(3.624208, 98.502748);
        map.addMarker(new MarkerOptions().position(Binjai).title("Binjai"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Binjai));

        LatLng Padang = new LatLng(-0.904372, 100.385078);
        map.addMarker(new MarkerOptions().position(Padang).title("Padang"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Padang));

        LatLng Bukittinggi = new LatLng(-0.303705, 100.373696);
        map.addMarker(new MarkerOptions().position(Bukittinggi).title("Bukittinggi"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bukittinggi));

        LatLng TanahDatar = new LatLng(-0.434113, 100.578662);
        map.addMarker(new MarkerOptions().position(TanahDatar).title("Tanah Datar"));
        map.moveCamera(CameraUpdateFactory. newLatLng(TanahDatar));

        LatLng PesisirSelatan = new LatLng(-1.698465, 100.913895);
        map.addMarker(new MarkerOptions().position(PesisirSelatan).title("Pesisir Selatan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(PesisirSelatan));

        LatLng Pasaman = new LatLng(0.402616, 100.071976);
        map.addMarker(new MarkerOptions().position(Pasaman).title("Pasaman"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pasaman));

        LatLng PadangPariaman = new LatLng(-0.520698, 100.222245);
        map.addMarker(new MarkerOptions().position(PadangPariaman).title("Padang Pariaman"));
        map.moveCamera(CameraUpdateFactory. newLatLng(PadangPariaman));

        LatLng Pariaman = new LatLng(-0.601139, 100.138796);
        map.addMarker(new MarkerOptions().position(Pariaman).title("Pariaman"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pariaman));

        LatLng KepMentawai = new LatLng(-1.497615, 98.965861);
        map.addMarker(new MarkerOptions().position(KepMentawai).title("Kepulauan Mentawai"));
        map.moveCamera(CameraUpdateFactory. newLatLng(KepMentawai));

        LatLng PasamanBarat = new LatLng(0.257997, 99.672238);
        map.addMarker(new MarkerOptions().position(PasamanBarat).title("Pasaman Barat"));
        map.moveCamera(CameraUpdateFactory. newLatLng(PasamanBarat));

        LatLng Solok = new LatLng(-0.908299, 100.789771);
        map.addMarker(new MarkerOptions().position(Solok).title("Solok"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Solok));

        LatLng Dharmasraya = new LatLng(-1.055661, 101.601674);
        map.addMarker(new MarkerOptions().position(Dharmasraya).title("Dharmasraya"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Dharmasraya));

        LatLng Dumai = new LatLng(1.668605, 101.400472);
        map.addMarker(new MarkerOptions().position(Dumai).title("Dumai"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Dumai));

        LatLng Kampar = new LatLng(0.386242, 101.118844);
        map.addMarker(new MarkerOptions().position(Kampar).title("Kampar"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Kampar));

        LatLng Pelalawan = new LatLng(0.140537, 102.111355);
        map.addMarker(new MarkerOptions().position(Pelalawan).title("Pelalawan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pelalawan));

        LatLng Palembang = new LatLng(-2.952566, 104.753349);
        map.addMarker(new MarkerOptions().position(Palembang).title("Palembang"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Palembang));

        LatLng oku = new LatLng(-4.117313, 104.080351);
        map.addMarker(new MarkerOptions().position(oku).title("OKU"));
        map.moveCamera(CameraUpdateFactory. newLatLng(oku));

        LatLng Prabumulih = new LatLng(-3.420070, 104.243206);
        map.addMarker(new MarkerOptions().position(Prabumulih).title("Prabumulih"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Prabumulih));

        LatLng Bengkulu = new LatLng(-3.818149, 102.301829);
        map.addMarker(new MarkerOptions().position(Bengkulu).title("Bengkulu"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bengkulu));

        LatLng Bulungan = new LatLng(2.852818, 116.921746);
        map.addMarker(new MarkerOptions().position(Bulungan).title("Bulungan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Bulungan));

        LatLng Nunukan = new LatLng(4.124232, 116.480613);
        map.addMarker(new MarkerOptions().position(Nunukan).title("Nunukan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Nunukan));

        LatLng Malinau = new LatLng(2.422659, 115.630211);
        map.addMarker(new MarkerOptions().position(Malinau).title("Malinau"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Malinau));

        LatLng Tarakan = new LatLng(3.346587, 117.569467);
        map.addMarker(new MarkerOptions().position(Tarakan).title("Tarakan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Tarakan));

        LatLng Balikpapan = new LatLng(-1.244968, 116.858911);
        map.addMarker(new MarkerOptions().position(Balikpapan).title("Balikpapan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Balikpapan));

        LatLng Samarinda = new LatLng(-0.476727, 117.167964);
        map.addMarker(new MarkerOptions().position(Samarinda).title("Samarinda"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Samarinda));

        LatLng Pontianak = new LatLng(-0.023379, 109.327771);
        map.addMarker(new MarkerOptions().position(Pontianak).title("Pontianak"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pontianak));

        LatLng Palangkaraya = new LatLng(-2.218793, 113.914367);
        map.addMarker(new MarkerOptions().position(Palangkaraya).title("Palangkaraya"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Palangkaraya));

        LatLng KotawaringinBarat = new LatLng(-2.440502, 111.770213);
        map.addMarker(new MarkerOptions().position(KotawaringinBarat).title("Kotawaringin Barat"));
        map.moveCamera(CameraUpdateFactory. newLatLng(KotawaringinBarat));

        LatLng KotawaringinTimur = new LatLng(-1.938938, 112.704276);
        map.addMarker(new MarkerOptions().position(KotawaringinTimur).title("Kotawaringin Timur"));
        map.moveCamera(CameraUpdateFactory. newLatLng(KotawaringinTimur));

        LatLng BaritoTimur = new LatLng(-1.944807, 115.144606);
        map.addMarker(new MarkerOptions().position(BaritoTimur).title("Barito Timur"));
        map.moveCamera(CameraUpdateFactory. newLatLng(BaritoTimur));

        LatLng Kapuas = new LatLng(-1.729383, 114.369363);
        map.addMarker(new MarkerOptions().position(Kapuas).title("Kapuas"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Kapuas));

        LatLng Katingan = new LatLng(-1.564757, 113.250945);
        map.addMarker(new MarkerOptions().position(Katingan).title("Katingan"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Katingan));

        LatLng Banjarbaru = new LatLng(-3.453151, 114.804685);
        map.addMarker(new MarkerOptions().position(Banjarbaru).title("Banjar Baru"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Banjarbaru));

        LatLng Banjarmasin = new LatLng(-3.312251, 114.590092);
        map.addMarker(new MarkerOptions().position(Banjarmasin).title("Banjarmasin"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Banjarmasin));

        LatLng Gorontalo = new LatLng(0.642791, 123.012799);
        map.addMarker(new MarkerOptions().position(Gorontalo).title("Gorontalo"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Gorontalo));

        LatLng Palu = new LatLng(-0.860277, 119.926041);
        map.addMarker(new MarkerOptions().position(Palu).title("Palu"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Palu));

        LatLng Sultara = new LatLng(0.754691, 123.945310);
        map.addMarker(new MarkerOptions().position(Sultara).title("Sulawesi Utara"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Sultara));

        LatLng Mamuju = new LatLng(-2.454299, 119.355549);
        map.addMarker(new MarkerOptions().position(Mamuju).title("Mamuju"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Mamuju));

        LatLng MamujuTengah = new LatLng(-1.971531, 119.602041);
        map.addMarker(new MarkerOptions().position(MamujuTengah).title("Mamuju Tengah"));
        map.moveCamera(CameraUpdateFactory. newLatLng(MamujuTengah));

        LatLng Majene = new LatLng(-3.199784, 118.871430);
        map.addMarker(new MarkerOptions().position(Majene).title("Majene"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Majene));

        LatLng Pasangkayu = new LatLng(-1.486428, 119.438559);
        map.addMarker(new MarkerOptions().position(Pasangkayu).title("Pasangkayu"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Pasangkayu));

        LatLng Sinjai = new LatLng(-5.203402, 120.142701);
        map.addMarker(new MarkerOptions().position(Sinjai).title("Sinjai"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Sinjai));

        LatLng Kolaka = new LatLng(-3.716099, 121.569828);
        map.addMarker(new MarkerOptions().position(Kolaka).title("Kolaka"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Kolaka));

        LatLng Kendari = new LatLng(-4.001829, 122.516443);
        map.addMarker(new MarkerOptions().position(Kendari).title("Kendari"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Kendari));

        LatLng Baubau = new LatLng(-5.464923, 122.600895);
        map.addMarker(new MarkerOptions().position(Baubau).title("Bau-Bau"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Baubau));

        LatLng Muna = new LatLng(-4.891981, 122.563452);
        map.addMarker(new MarkerOptions().position(Muna).title("Muna"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Muna));

        LatLng Konawe = new LatLng(-3.721067, 121.921117);
        map.addMarker(new MarkerOptions().position(Konawe).title("Konawe"));
        map.moveCamera(CameraUpdateFactory. newLatLng(Konawe));
    }
}
