
public class Main {
    public static void main(String[] args) throws LinkedListIndexOutOfBoundsException {

        // Create a new linked list to experiment with
        LinkedList newList = new LinkedList(new Node(5));

        // Node that will later be removed by reference
        Node node_to_be_removed = new Node(11);

        // Add nodes
        newList.add(new Node(2)); // [1] because LinkedList received the root node upon creation
        newList.add(new Node(8)); // [2]
        newList.add(new Node(1)); // [3]
        newList.add(new Node(3)); // [4]
        newList.add(node_to_be_removed); // [5]
        newList.add(new Node(4));  // [6]

        // Print the elements of the result list
        newList.display(); // 5 2 8 1 3 11 4

        System.out.println(newList.getByIndex(4).getValue()); // 3

        // Remove the second element and print the result list
        newList.removeByIndex(1);
        newList.display(); // 5 8 1 3 11 4

        // Remove element with the value of 11 and print the result list
        newList.removeByReference(node_to_be_removed);
        newList.display(); // 5 8 1 3 4

        // Clear the list and print the result
        newList.clear();
        newList.display(); // Clean

        // Create two boxes
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> newOrangeBox = new Box<>();

        // Populate boxes
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        newOrangeBox.add(new Orange());
        newOrangeBox.add(new Orange());
        newOrangeBox.add(new Orange());

        // Check fruits
        orangeBox.display(); // 4x
        newOrangeBox.display(); // 3x

        System.out.println(orangeBox.compare(newOrangeBox)); // false

        orangeBox.moveFruitsTo(newOrangeBox);

        orangeBox.display(); // 0x
        newOrangeBox.display(); // 7x
    }
}
