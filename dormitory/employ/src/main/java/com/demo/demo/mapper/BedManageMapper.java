package com.demo.demo.mapper;

import com.demo.demo.model.BedManage;
import java.util.List;

public interface BedManageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BedManage record);

    BedManage selectByPrimaryKey(Integer id);

    List<BedManage> selectAll(BedManage bedManage);

    int updateByPrimaryKey(BedManage record);
}