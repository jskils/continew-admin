/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.system.model.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 头像信息
 *
 * @author Charles7c
 * @since 2023/1/2 16:29
 */
@Data
@Accessors(chain = true)
@Schema(description = "头像信息")
public class AvatarVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 头像地址
     */
    @Schema(description = "头像地址")
    private String avatar;
}
