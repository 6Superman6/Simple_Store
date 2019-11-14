package demo.service;

import demo.model.Content;
import demo.service.base.BaseService;

import java.util.List;

public interface ContentService extends BaseService<Content> {

    public List<Content> findAll2();

    public List<Content> findAllwBuy();  ////查看未购买的内容

    public List<Content> findAllyBuy();  //查看已购买的内容

}
