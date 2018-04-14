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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import testeos.victor.me.testeos.pruebas.Animal;
import testeos.victor.me.testeos.pruebas.AnimalManager;
import testeos.victor.me.testeos.pruebas.Comida;
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

                ArrayList<Gato> g = animalManager.getGatos();
                t.setText(g.get(0).getComida().get(0).getName());
                /*
                ArrayList<Object> arr = animalManager.getAnimals().get("Gatos");
                for(Object o : arr){
                    if(o instanceof Gato){
                        Gato g = (Gato) o;
                        t.setText(g.getComida().get(0).getAnimal().getName());
                    }
                }
*/




                /*
                ArrayList<Gato> arr = animalManager.getAnimals().get("Gatos");
                for(Gato g : arr){
                    System.out.println("Entra");
                        t.setText(g.getComida().get(0).getAnimal().getName());
                    }*/
                }



            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    private void adder(){
        Animal a1 = new Gato("gato",4);
        Animal a2 = new Perro("Perro", 5);
        Animal a3 = new Tigre("Tigre");
        Comida c = new Comida("pienso",a1);
        if(a1 instanceof Gato){
            Gato g = (Gato) a1;
            g.addComida(c);
        }
        animalManager.addAnimal(a1);
        animalManager.addAnimal(a2);
        animalManager.addAnimal(a3);
        myRef.setValue(animalManager);
    }
}
