package org.launchcode.churchwebsite.models.data;

import org.launchcode.churchwebsite.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

}
