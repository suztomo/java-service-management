/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Request message for DisableService method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.DisableServiceRequest}
 */
public final class DisableServiceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.DisableServiceRequest)
    DisableServiceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DisableServiceRequest.newBuilder() to construct.
  private DisableServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DisableServiceRequest() {
    serviceName_ = "";
    consumerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DisableServiceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DisableServiceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              serviceName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              consumerId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_DisableServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_DisableServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.DisableServiceRequest.class,
            com.google.api.servicemanagement.v1.DisableServiceRequest.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   *
   *
   * <pre>
   * Required. Name of the service to disable. Specifying an unknown service name
   * will cause the request to fail.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the service to disable. Specifying an unknown service name
   * will cause the request to fail.
   * </pre>
   *
   * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object consumerId_;
  /**
   *
   *
   * <pre>
   * Required. The identity of consumer resource which service disablement will be
   * applied to.
   * The Google Service Management implementation accepts the following
   * forms:
   * - "project:&lt;project_id&gt;"
   * Note: this is made compatible with
   * google.api.servicecontrol.v1.Operation.consumer_id.
   * </pre>
   *
   * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The consumerId.
   */
  @java.lang.Override
  public java.lang.String getConsumerId() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The identity of consumer resource which service disablement will be
   * applied to.
   * The Google Service Management implementation accepts the following
   * forms:
   * - "project:&lt;project_id&gt;"
   * Note: this is made compatible with
   * google.api.servicecontrol.v1.Operation.consumer_id.
   * </pre>
   *
   * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for consumerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConsumerIdBytes() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      consumerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (!getConsumerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, consumerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (!getConsumerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, consumerId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.api.servicemanagement.v1.DisableServiceRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.DisableServiceRequest other =
        (com.google.api.servicemanagement.v1.DisableServiceRequest) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (!getConsumerId().equals(other.getConsumerId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + CONSUMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConsumerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.api.servicemanagement.v1.DisableServiceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for DisableService method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.DisableServiceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.DisableServiceRequest)
      com.google.api.servicemanagement.v1.DisableServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_DisableServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_DisableServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.DisableServiceRequest.class,
              com.google.api.servicemanagement.v1.DisableServiceRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.DisableServiceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      serviceName_ = "";

      consumerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_DisableServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.DisableServiceRequest getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.DisableServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.DisableServiceRequest build() {
      com.google.api.servicemanagement.v1.DisableServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.DisableServiceRequest buildPartial() {
      com.google.api.servicemanagement.v1.DisableServiceRequest result =
          new com.google.api.servicemanagement.v1.DisableServiceRequest(this);
      result.serviceName_ = serviceName_;
      result.consumerId_ = consumerId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.servicemanagement.v1.DisableServiceRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.DisableServiceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.DisableServiceRequest other) {
      if (other == com.google.api.servicemanagement.v1.DisableServiceRequest.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getConsumerId().isEmpty()) {
        consumerId_ = other.consumerId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.servicemanagement.v1.DisableServiceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.api.servicemanagement.v1.DisableServiceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the service to disable. Specifying an unknown service name
     * will cause the request to fail.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the service to disable. Specifying an unknown service name
     * will cause the request to fail.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the service to disable. Specifying an unknown service name
     * will cause the request to fail.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the service to disable. Specifying an unknown service name
     * will cause the request to fail.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {

      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the service to disable. Specifying an unknown service name
     * will cause the request to fail.
     * </pre>
     *
     * <code>string service_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      serviceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object consumerId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The identity of consumer resource which service disablement will be
     * applied to.
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:&lt;project_id&gt;"
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * </pre>
     *
     * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The consumerId.
     */
    public java.lang.String getConsumerId() {
      java.lang.Object ref = consumerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The identity of consumer resource which service disablement will be
     * applied to.
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:&lt;project_id&gt;"
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * </pre>
     *
     * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for consumerId.
     */
    public com.google.protobuf.ByteString getConsumerIdBytes() {
      java.lang.Object ref = consumerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        consumerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The identity of consumer resource which service disablement will be
     * applied to.
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:&lt;project_id&gt;"
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * </pre>
     *
     * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      consumerId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The identity of consumer resource which service disablement will be
     * applied to.
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:&lt;project_id&gt;"
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * </pre>
     *
     * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConsumerId() {

      consumerId_ = getDefaultInstance().getConsumerId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The identity of consumer resource which service disablement will be
     * applied to.
     * The Google Service Management implementation accepts the following
     * forms:
     * - "project:&lt;project_id&gt;"
     * Note: this is made compatible with
     * google.api.servicecontrol.v1.Operation.consumer_id.
     * </pre>
     *
     * <code>string consumer_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      consumerId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.DisableServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.DisableServiceRequest)
  private static final com.google.api.servicemanagement.v1.DisableServiceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.DisableServiceRequest();
  }

  public static com.google.api.servicemanagement.v1.DisableServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisableServiceRequest> PARSER =
      new com.google.protobuf.AbstractParser<DisableServiceRequest>() {
        @java.lang.Override
        public DisableServiceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DisableServiceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DisableServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisableServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.DisableServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
