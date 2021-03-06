package com.yiwen.playground.model.messages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JoinBattleMessage implements Serializable {
    private Long battleId;
    private Long playerId;
}
