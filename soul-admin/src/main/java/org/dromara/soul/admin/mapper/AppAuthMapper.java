/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.dromara.soul.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dromara.soul.admin.entity.AppAuthDO;

/**
 * AppAuthMapper.
 *
 * @author xiaoyu(549477611 @ qq.com)
 */
@Mapper
public interface AppAuthMapper {

    /**
     * select application authority by id
     *
     * @param id
     * @return
     */
    AppAuthDO selectById(Long id);

    /**
     * insert application authority
     *
     * @param appAuthDO
     * @return
     */
    int insert(AppAuthDO appAuthDO);

    /**
     * insert selective application authority
     *
     * @param appAuthDO
     * @return
     */
    int insertSelective(AppAuthDO appAuthDO);

    /**
     * update application authority
     *
     * @param appAuthDO
     * @return
     */
    int update(AppAuthDO appAuthDO);

    /**
     * update selective application authority
     *
     * @param appAuthDO
     * @return
     */
    int updateSelective(AppAuthDO appAuthDO);
}