package com.huachuan.mall.modules.ums.mapper;

import com.huachuan.mall.modules.ums.model.UmsRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author huachuan
 * @since 2022-07-23
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {
    /**
     * 获取用户所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
}
