package ru.home.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.model.Test;

/**
 * Created by Maksim on 23.02.2016.
 */
public interface TestRepo extends JpaRepository<Test, Long> {
}
