package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.BookPublishingInfo;
import cn.edu.ustb.dm.model.BookPublishingInfoExample;
import cn.edu.ustb.dm.model.BookPublishingInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookPublishingInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int countByExample(BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByExample(BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByPrimaryKey(Integer book_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insert(BookPublishingInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insertSelective(BookPublishingInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<BookPublishingInfoWithBLOBs> selectByExampleWithBLOBs(BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<BookPublishingInfo> selectByExample(BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    BookPublishingInfoWithBLOBs selectByPrimaryKey(Integer book_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") BookPublishingInfoWithBLOBs record, @Param("example") BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleWithBLOBs(@Param("record") BookPublishingInfoWithBLOBs record, @Param("example") BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExample(@Param("record") BookPublishingInfo record, @Param("example") BookPublishingInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeySelective(BookPublishingInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKeyWithBLOBs(BookPublishingInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_publishing_info
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByPrimaryKey(BookPublishingInfo record);
}