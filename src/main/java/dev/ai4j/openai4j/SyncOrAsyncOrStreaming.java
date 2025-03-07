package dev.ai4j.openai4j;

import java.util.function.Consumer;

public interface SyncOrAsyncOrStreaming<ResponseContent> extends SyncOrAsync<ResponseContent> {

    StreamingResponseHandling onPartialResponse(Consumer<ResponseContent> partialResponseHandler);

    StreamingResponseHandling onPartialResponse(Consumer<ResponseContent> partialResponseHandler, Consumer<ResponseContent> partialReasoningResponseHandler);
}