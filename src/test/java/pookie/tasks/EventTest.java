package pookie.tasks;  //same package as the class being tested

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {
    @Test
    public void testToString(){
        assertEquals("[E][ ]tp project meeting (from: 2pm to: 4pm)", new Event("tp project meeting", "2pm", "4pm").toString());
    }

    @Test
    public void testWriteToFileString(){
        assertEquals("event tp project meeting /from 2pm /to 4pm", new Event("tp project meeting", "2pm", "4pm").writeToFileString());
    }
}