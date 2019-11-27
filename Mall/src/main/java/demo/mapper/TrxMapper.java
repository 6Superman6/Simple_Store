package demo.mapper;

import demo.mapper.base.BaseMapper;
import demo.model.Trx;
import demo.model.TrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrxMapper extends BaseMapper<Trx> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int countByExample(TrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int deleteByExample(TrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    void insert(Trx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int insertSelective(Trx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    List<Trx> selectByExample(TrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    Trx selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") Trx record, @Param("example") TrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int updateByExample(@Param("record") Trx record, @Param("example") TrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int updateByPrimaryKeySelective(Trx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trx
     *
     * @mbggenerated Mon Nov 11 10:49:21 CST 2019
     */
    int updateByPrimaryKey(Trx record);
}