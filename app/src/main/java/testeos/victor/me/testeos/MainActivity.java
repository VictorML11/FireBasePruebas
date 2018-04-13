package testeos.victor.me.testeos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import testeos.victor.me.testeos.pruebas.Animal;
import testeos.victor.me.testeos.pruebas.AnimalManager;
import testeos.victor.me.testeos.pruebas.Gato;
import testeos.victor.me.testeos.pruebas.Perro;
import testeos.victor.me.testeos.pruebas.Tigre;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef;
    AnimalManager animalManager = new AnimalManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = findViewById(R.id.x);

        myRef = database.getReference("Km0");
        UserHandler userHandler = new UserHandler();


        //adder();
        gett();

        //myRef.setValue(userHandler);

    }

    private void gett(){

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //animalManager.getAnimals().clear();
                animalManager = dataSnapshot.getValue(AnimalManager.class);
                TextView t = findViewById(R.id.x);
                t.setText(animalManager.toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void adder(){
        AnimalManager animalManager = new AnimalManager();
        animalManager.init();
        Animal a1 = new Gato("gato",4);
        Animal a2 = new Perro("Perro", 5);
        Animal a3 = new Tigre("Tigre");
        animalManager.addAnimal("Gatos",a1);
        animalManager.addAnimal("Perros",a2);
        animalManager.addAnimal("Tigres",a3);
        myRef.setValue(animalManager);
    }
}
