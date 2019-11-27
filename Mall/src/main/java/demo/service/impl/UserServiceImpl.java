package demo.service.impl;

import demo.model.User;
import demo.service.UserService;
import demo.service.base.BaseServiceImpl;
import demo.utils.ServerResponse;
import jdk.nashorn.internal.runtime.ECMAException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional  // 回滚(事务)
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public ServerResponse insert(User user) {

        try
        {
            int sum = getCountById(user.getId());
            if(sum!=0)
            {
                return ServerResponse.createByErrorMsg2("该编号的数据已存在");
            }
            List<User> list = findAll2();
            if(list!=null)
            {
                for(User u : list)
                {
                    if(u.equals(user))
                    {
                        return ServerResponse.createByErrorMsg2("该数据已存在");
                    }
                }
            }

            userMapper.insert(user);
            return ServerResponse.createBySuccessMsg("添加成功");
        }
        catch (Exception e)
        {
            return ServerResponse.createByError("添加失败");
        }
    }

    @Override
    public ServerResponse delete(int id) {
        int sum = getCountById(id);
        if(sum==0)
        {
            return ServerResponse.createByError("该编号不存在");
        }
        try
        {
            userMapper.delete(id);
            return ServerResponse.createBySuccessMsg("删除成功");
        }catch (Exception e)
        {
            return ServerResponse.createByError("删除失败");
        }
    }

    @Override
    public ServerResponse update(User user) {

        try
        {
            System.out.println("user : "+user);
            int sum = getCountById(user.getId());
            if(sum==0)
            {
                return ServerResponse.createByError("更新失败，该数据不存在");
            }
            User u = select(user.getId());
            if(u.equals(user))
            {
                return ServerResponse.createBySuccessMsg("用户数据未作修改");
            }
            if(user.getAge()!=0)
            {
                u.setAge(user.getAge());
            }
            if(user.getName()!=null)
            {
                u.setName(user.getName());
            }
            if(user.getDate()!=null)
            {
                u.setDate(user.getDate());
            }
            userMapper.update(u);
            return ServerResponse.createBySuccessMsg("更新成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return ServerResponse.createByError("更新失败");
        }

    }

    public User select(int id)
    {
        return userMapper.get(id);
    }

    @Override
    public ServerResponse get(int id) {
        int sum = getCountById(id);
        if(sum==0)
        {
            return ServerResponse.createByError("该用户的编号不存在");
        }
        User user = userMapper.get(id);
        return ServerResponse.createBySuccess("用户数据",user);
    }

    public List<User> findAll2()
    {
        List<User> list = userMapper.findAll();
        return list;
    }

    @Override
    public ServerResponse findAll() {
        List<User> list = userMapper.findAll();
        if(list.isEmpty())
        {
            return ServerResponse.createBySuccessMsg("暂无数据");
        }
        return ServerResponse.createBySuccess("查询成功，数据如下",list);
    }

    @Override
    public int getCountById(int id) {
        return userMapper.getCountById(id);
    }

    @Override
    public ServerResponse getyName(String name) {
        List<User> user = userMapper.getyName(name);
        if(user.isEmpty())
        {
            return ServerResponse.createByError("用户名不存在");
        }
        return ServerResponse.createBySuccess("用户数据",user);
    }
}
