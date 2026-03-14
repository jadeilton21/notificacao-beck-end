package com.jadeilton.notificacao.business.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jadeilton.notificacao.business.enums.StatusNotificacoEnum;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class TarefasDTO {





    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StatusNotificacoEnum statusNotificacoEnum;

}
