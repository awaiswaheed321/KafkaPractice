package com.awais.kafkaexample.message;

import java.io.Serializable;

public record MessageRequest(String message) implements Serializable {
}
