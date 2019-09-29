package com.bw.mapper;

import com.bw.pojo.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface Commentmapper extends Mapper<Comment> {
    @Select("select * from tb_comment c LEFT JOIN tb_shop s on c.sid = s.sid LEFT JOIN t_user u on c.uid = u.uid;")
    List<Comment> queryall();

    @Insert("INSERT INTO `zk`.`tb_comment` ( `comment`, `commentdate`, `uid`, `sid`) VALUES ( #{comment.comment}, #{comment.commentdate}, #{comment.uid}, #{comment.sid});")
    void insertcomment(Comment comment);
}
