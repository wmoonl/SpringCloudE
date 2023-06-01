package club.sh1nyu.dao;

import club.sh1nyu.domain.UserModel;

import java.util.List;

public interface UserDao
{
    List<UserModel>  queryUsers();
}
