package advanced.android.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ConceptExamples();
    }

    private void ConceptExamples()
    {
        Dog dog = new Dog();
        dog.Bark();

        Animal dog_animal = dog;
        dog_animal.name = "Masha";

        Object dog_object = dog;
        ((IAnimal) dog_object).Drool();
    }
}
