package com.cg.oam.repository;

public interface UserRepository {

	User addUser(User var1);

	User updateUser(User var1) throws UserNotFoundException;

	User removeUser(int var1) throws UserNotFoundException;

	List<User> showAllUsers();

	boolean validateUser(int var1, String var2);
}

}
