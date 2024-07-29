package javacore.dates.restaurantlogs.repositories;

import java.util.List;

public interface TextRepository {
    void saveLog(String log);
    List<String> getAll();
}
