package demo.service.impl;

import demo.model.Person;
import demo.service.PersonService;
import demo.service.base.BaseServiceImpl;
import demo.utils.ServerResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService {


    @Override
    public ServerResponse insert(Person person) {
        try
        {
            personMapper.insert(person);
            return ServerResponse.createBySuccessMsg("添加成功");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ServerResponse.createByError("添加失败");
    }

    @Override
    public ServerResponse delete(int id) {
        return null;
    }

    @Override
    public ServerResponse update(Person person) {
        return null;
    }

    @Override
    public ServerResponse get(int id) {
        Person person =personMapper.selectByPrimaryKey(1);
        return ServerResponse.createBySuccess("yes",person);
    }

    @Override
    public ServerResponse findAll() {
        return null;
    }

    @Override
    public int getCountById(int id) {
        return 0;
    }

    @Override
    public ServerResponse getyName(String name) {
        return null;
    }

    @Override
    public ServerResponse dologin(String username, String password) {
        try
        {
            Person person = personMapper.dologin(username,password);
            if(person!=null)
            {
                return ServerResponse.createBySuccess("登录成功",person);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            return ServerResponse.createByError("登录失败，用户名或密码错误");
        }
        return ServerResponse.createByError("登录失败，用户名或密码错误");
    }
}
