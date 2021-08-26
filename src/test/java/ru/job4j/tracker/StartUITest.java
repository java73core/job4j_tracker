package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("FirstName"));
        int expected = item.getId();
        Input in = new StubInput(
                new String[] {"0",String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindById(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getId(), is(expected));
    }

    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("FirstName"));
        Input in = new StubInput(
                new String[] {"0",String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindByName(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() +
                "0. Find items by name" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() +
                "=== Find items by name ===" +  System.lineSeparator() +
                "Заявки с таким именем не найдены" + System.lineSeparator() +
                "Menu:" + System.lineSeparator() +
                "0. Find items by name" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenShowAllAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("FirstName"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + System.lineSeparator() +
                        "0. Show all items" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Show all items ===" +  System.lineSeparator() +
                        item + System.lineSeparator() + "Menu:" + System.lineSeparator() +
                "0. Show all items" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }
    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "Newitem";
        Input in = new StubInput(
                new String[] {"0",String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() +
                "0. Edit item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() +
                "=== Edit item ===" +  System.lineSeparator() +
                "Replace was successfully" + System.lineSeparator() +
                "Menu:" + System.lineSeparator() +
                "0. Edit item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0",String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
}

