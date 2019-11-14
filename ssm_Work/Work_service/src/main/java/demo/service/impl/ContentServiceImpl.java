package demo.service.impl;

import demo.model.Content;
import demo.model.ContentWithBLOBs;
import demo.service.ContentService;
import demo.service.base.BaseServiceImpl;
import demo.utils.ServerResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContentServiceImpl extends BaseServiceImpl<Content> implements ContentService {


    @Override
    public ServerResponse insert(Content content) {
        try
        {
            contentMapper.insert(content);
            return ServerResponse.createBySuccessMsg("插入成功");
        }catch (Exception e)
        {
            return ServerResponse.createByError("插入失败");
        }
    }

    @Override
    public ServerResponse delete(int id) {
        int count = getCountById(id);
        if(count==0)
        {
            return ServerResponse.createByError("该编号不存在,删除失败");
        }
        try
        {
            contentMapper.deleteByPrimaryKey(id);
            return ServerResponse.createBySuccessMsg("删除成功");
        }catch (Exception e)
        {
            return ServerResponse.createByError("删除失败");
        }
    }

    @Override
    public ServerResponse update(Content content) {
        int count = getCountById(content.getId());
        if(count==0||content==null)
        {
            return ServerResponse.createByError("更新失败，该数据不存在");
        }
        try
        {
            Content content1 = get2(content.getId());
            if (content1==null)
            {
                System.out.println("content1为空");
            }
            if (content.getIcon()!=null)
            {
                content1.setIcon(content.getIcon());
            }
            if(content.getPrice()!=0)
            {
                content1.setPrice(content.getPrice());
            }
            if(content.getRemark()!=null)
            {
                content1.setRemark(content.getRemark());
            }
            if(content.getText()!=null)
            {
                content1.setText(content.getText());
            }
            if(content.getTitle()!=null)
            {
                content1.setTitle(content.getTitle());
            }
            if(content.getIsbuy()!=null)
            {
                content1.setIsbuy(content.getIsbuy());
            }
            if (content.getIssell()!=null)
            {
                content1.setIssell(content.getIssell());
            }
            contentMapper.updateByPrimaryKey(content1);
            return ServerResponse.createBySuccessMsg("更新成功");
        }catch (Exception e)
        {
            System.out.println("出错了");
            e.printStackTrace();
        }
        return ServerResponse.createByError("更新失败");
    }

    public Content get2(int id)
    {
        int count = getCountById(id);
        if(count==0)
        {
            return null;
        }
        return contentMapper.get(id);
    }

    @Override
    public ServerResponse get(int id) {
//        System.out.println(id+"    66666");
        try
        {
            int count = getCountById(id);
            if(count==0)
            {
                return ServerResponse.createByError("该编号不存在");
            }
            Content content = contentMapper.get(id);
            return ServerResponse.createBySuccess("发布信息",content);
        }catch (Exception e)
        {
            e.printStackTrace();
            return ServerResponse.createByError("该编号不存在");
        }

    }

    @Override
    public ServerResponse findAll() {
        List<Content> list = contentMapper.findAll();
        if(list==null||list.isEmpty())
        {
            return ServerResponse.createBySuccessMsg("暂无信息");
        }
        return ServerResponse.createBySuccess("数据如下",list);
    }

    public List<Content> findAll2()
    {
        List<Content> list = contentMapper.findAll();
        return list;
    }

    @Override
    public List<Content> findAllwBuy() {
        return contentMapper.findAllwBuy();
    }

    @Override
    public List<Content> findAllyBuy() {
        return contentMapper.findAllyBuy();
    }

    @Override
    public int getCountById(int id) {
        int count=-1;
        try
        {
           count =  contentMapper.getCountById(id);
        }catch (Exception e)
        {
            System.out.println("*********************");
            e.printStackTrace();
            System.out.println("*********************");

        }
        return count;
    }

    @Override
    public ServerResponse getyName(String name) {
        return null;
    }
}
