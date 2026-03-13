import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже участвует в спектакле.");
            return;
        }

        listOfActors.add(actor);
        System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() +
                " добавлен в список участников спектакля " + getTitle() + ".");
    }

    public void replaceActor(Actor actor, String actorSurnameForReplace) {
        Actor replancedActor = findActorBySurname(actorSurnameForReplace);
        if (replancedActor == null) {
            System.out.println("Актёр с фамилией " + actorSurnameForReplace + " в спектакле не участвует. " +
                    "Замена невозможна.");
            return;
        }

        listOfActors.remove(replancedActor);
        listOfActors.add(actor);
        System.out.println("Актёр по фамилии " + actorSurnameForReplace + " заменён на " + actor.getSurname());
    }

    private Actor findActorBySurname(String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                return actor;
            }
        }
        return null;
    }
}
