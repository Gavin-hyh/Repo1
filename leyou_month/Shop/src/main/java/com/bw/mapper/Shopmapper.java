package com.bw.mapper;

import com.bw.pojo.Shop;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface Shopmapper extends Mapper<Shop> {
    @Select("${sql}")
    List<Shop> queryAll(String sql);
    @Update("update tb_shop set `status` = 0 where sid = #{i};")
    void down(int i);
}
