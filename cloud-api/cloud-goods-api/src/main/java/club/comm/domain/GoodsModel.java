package club.comm.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: ShenYu
 * @Description:
 * @Date: Created in 2020/4/9 10:12
 * @Modified By:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoodsModel implements Serializable
{
    private static final long serialVersionUID = -8349772844515338215L;
    private Integer id;
    private String name;
}
