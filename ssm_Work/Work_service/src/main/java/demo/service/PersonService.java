package demo.service;

import demo.model.Person;
import demo.service.base.BaseService;
import demo.utils.ServerResponse;

public interface PersonService extends BaseService<Person> {

    ServerResponse dologin(String username, String password);

}
