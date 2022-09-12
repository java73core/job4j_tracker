package ru.job4j.tracker;

import org.junit.*;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqlTrackerTest {

    private static Connection connection;

}