package org.zerock.b02.dto.upload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BoardImageDTO {
    private String uuid;
    private String fileName;
    private int ord;
}

