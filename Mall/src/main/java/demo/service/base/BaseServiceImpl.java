package demo.service.base;

import demo.mapper.ContentMapper;
import demo.mapper.PersonMapper;
import demo.mapper.TrxMapper;
import demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    public UserMapper userMapper;
    @Autowired
    public ContentMapper contentMapper;
    @Autowired
    public PersonMapper personMapper;
    @Autowired
    public TrxMapper trxMapper;

}
