package club.comm.dao;

import club.comm.domain.UserModel;

import java.util.List;

public interface UserDao
{
    List<UserModel>  queryUsers();
}
