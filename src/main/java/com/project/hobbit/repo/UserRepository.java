package com.project.hobbit.repo;

import com.project.hobbit.model.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface UserRepository extends CrudRepository<User, UUID> {
}
