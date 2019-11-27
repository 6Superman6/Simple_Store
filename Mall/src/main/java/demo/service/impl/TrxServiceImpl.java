package demo.service.impl;

import demo.model.Trx;
import demo.service.TrxService;
import demo.service.base.BaseServiceImpl;
import demo.utils.ServerResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional  // 回滚(事务)
public class TrxServiceImpl extends BaseServiceImpl<Trx> implements TrxService {

    @Override
    public ServerResponse insert(Trx trx) {
        System.out.println("trx: "+trx);
        try
        {
            trxMapper.insert(trx);
            return ServerResponse.createBySuccessMsg("添加成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return ServerResponse.createByError("添加失败");
        }
    }

    @Override
    public ServerResponse delete(int id) {
        return null;
    }

    @Override
    public ServerResponse update(Trx trx) {
        return null;
    }

    @Override
    public ServerResponse get(int id) {
        return null;
    }

    @Override
    public ServerResponse findAll() {
        List<Trx> list = trxMapper.findAll();
        return ServerResponse.createBySuccess("数据如下",list);
    }

    @Override
    public int getCountById(int id) {
        return 0;
    }

    @Override
    public ServerResponse getyName(String name) {
        return null;
    }
}
