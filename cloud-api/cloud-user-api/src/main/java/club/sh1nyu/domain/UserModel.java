package club.sh1nyu.domain;

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
public class UserModel implements Serializable
{
    private static final long serialVersionUID = 1565314918835209551L;
    private Integer id;
    private String name;
}
