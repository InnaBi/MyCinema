import java.io.*;
public class Program {

    static Cinema cinema;

    public static void main(String[] args) {
        initCinema();


        System.out.println(cinema.getFilms());
        System.out.println(cinema.getAuthors());



        save(cinema);

    }

    private static void initCinema() {
        File file = new File("backup");
        if (file.exists()) {
            try (
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
                Object o = ois.readObject();
                if (o instanceof Cinema) {
                    cinema = (Cinema) o;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (EOFException e) {
                cinema = new Cinema();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            cinema = new Cinema();
        }
    }

    private static void save(Cinema cinema) {
        try (
                FileOutputStream fos = new FileOutputStream("backup");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(cinema);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}


