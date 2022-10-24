import java.util.Scanner;

public class Main {
    public static int loop = 1;
    public static String note = null;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        noteApp();
    }

    /**
     * Home of Simple Note App
     */
    public static void noteApp() {
        while (true) {
            System.out.println("Loop: " + loop);
            loop++;

            System.out.println("Simple Note App v1.0");

            if (note == null || note.isBlank()) {
                System.out.println("You don't have a note.\n");
            } else {
                System.out.println("\"" + note + "\" \n");
            }

            System.out.println("Menu: (please use the number to proceed)");
            System.out.println("1. Add note");
            System.out.println("2. Edit note");
            System.out.println("3. Delete note");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewAddNote();
            } else if (choice.equals("2")) {
                viewEditNote();
            } else if (choice.equals("3")) {
                viewDeleteNote();
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Please pick the right number (1/2/3/4)");
            }
            System.out.println("");
        }
    }

    /**
     * Function for view add note
     */
    public static void viewAddNote() {
        if (note == null) {
            System.out.print("Add note: ");
            String temp = scanner.nextLine();
            if (temp.isBlank()) {
                System.out.println("Note can't be empty");
            } else {
                addNote(temp);
            }
        } else {
            System.out.println("You already have a note: " + note);
            while (true) {
                System.out.print("Go to edit? (Y/N): ");
                String goToEdit = scanner.nextLine();
                if (goToEdit.equalsIgnoreCase("y")) {
                    viewEditNote();
                    break;
                } else if (goToEdit.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Please type \"Y\" or \"N\"");
                }
            }
        }
    }

    /**
     * Function for add note
     *
     * @param addNote for add new note
     */
    public static void addNote(String addNote) {
        note = addNote;
        System.out.println("Note successfully added!");
    }

    /**
     * Function for test add note
     */
    public static void testAddNote() {
        System.out.println("TEST ADD");
        System.out.println("NOTE: " + note);
        System.out.println("ADD NOTE \"ABCD\"");
        addNote("ABCD");
        System.out.println("NOTE: " + note);
    }

    /**
     * Function for view edit note
     */
    public static void viewEditNote() {
        if (note == null) {
            System.out.println("Can't Edit.\nPlease write a note first, thank you!");
        } else {
            System.out.println("Your previous note: \"" + note + "\"");
            System.out.print("New note: ");
            String editNote = scanner.nextLine();
            if (editNote == null || editNote.isBlank()) {
                System.out.println("Note can't be empty");
            } else {
                editNote(editNote);
            }
        }
    }

    /**
     * Function for edit note
     *
     * @param editNote for new note
     */
    public static void editNote(String editNote) {
        note = editNote;
        System.out.println("Note succesfully edited!");
    }

    /**
     * Function for test edit note
     */
    public static void testEditNote() {
        System.out.println("TEST EDIT");
        note = "ABCD";
        System.out.println("BEFORE: " + note);
        System.out.println("EDIT WITH \"EFGH\"");
        editNote("EFGH");
        System.out.println("AFTER: " + note);
    }

    /**
     * Function for view delete note
     */
    public static void viewDeleteNote() {
        if (note == null) {
            System.out.println("Can't delete.\nPlease write a note first, thank you!");
        } else {
            while (true) {
                System.out.print("Delete Note: \"" + note + "\"? (Y/N): ");
                String yOrN = scanner.nextLine();
                if (yOrN.equalsIgnoreCase("y")) {
                    deleteNote();
                    break;
                } else if (yOrN.equalsIgnoreCase("n")) {
                    System.out.println("Switch to Homepage");
                    break;
                } else {
                    System.out.println("Please type y/n");
                }
            }
        }
    }

    /**
     * Function for delete note
     */
    public static void deleteNote() {
        note = null;
        System.out.println("Note succesfully deleted!");
    }

    /**
     * Function for test delete note
     */
    public static void testDeleteNote() {
        System.out.println("TEST DELETE");
        note = "ABCD";
        System.out.println("NOTE: " + note);
        System.out.println("DELETE NOTE \"ABCD\"");
        deleteNote();
        System.out.println("NOTE: " + note);
    }
}