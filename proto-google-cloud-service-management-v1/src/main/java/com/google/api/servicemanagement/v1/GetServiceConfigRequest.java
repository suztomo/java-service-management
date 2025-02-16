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
 * Request message for GetServiceConfig method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.GetServiceConfigRequest}
 */
public final class GetServiceConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.GetServiceConfigRequest)
    GetServiceConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetServiceConfigRequest.newBuilder() to construct.
  private GetServiceConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetServiceConfigRequest() {
    serviceName_ = "";
    configId_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetServiceConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetServiceConfigRequest(
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

              configId_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              view_ = rawValue;
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
        .internal_static_google_api_servicemanagement_v1_GetServiceConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_GetServiceConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.GetServiceConfigRequest.class,
            com.google.api.servicemanagement.v1.GetServiceConfigRequest.Builder.class);
  }

  /** Protobuf enum {@code google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView} */
  public enum ConfigView implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Server response includes all fields except SourceInfo.
     * </pre>
     *
     * <code>BASIC = 0;</code>
     */
    BASIC(0),
    /**
     *
     *
     * <pre>
     * Server response includes all fields including SourceInfo.
     * SourceFiles are of type 'google.api.servicemanagement.v1.ConfigFile'
     * and are only available for configs created using the
     * SubmitConfigSource method.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    FULL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Server response includes all fields except SourceInfo.
     * </pre>
     *
     * <code>BASIC = 0;</code>
     */
    public static final int BASIC_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Server response includes all fields including SourceInfo.
     * SourceFiles are of type 'google.api.servicemanagement.v1.ConfigFile'
     * and are only available for configs created using the
     * SubmitConfigSource method.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    public static final int FULL_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigView valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConfigView forNumber(int value) {
      switch (value) {
        case 0:
          return BASIC;
        case 1:
          return FULL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConfigView> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ConfigView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConfigView>() {
          public ConfigView findValueByNumber(int number) {
            return ConfigView.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.GetServiceConfigRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ConfigView[] VALUES = values();

    public static ConfigView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ConfigView(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView)
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   *
   *
   * <pre>
   * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
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
   * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
   * for naming requirements.  For example: `example.googleapis.com`.
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

  public static final int CONFIG_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object configId_;
  /**
   *
   *
   * <pre>
   * Required. The id of the service configuration resource.
   * This field must be specified for the server to return all fields, including
   * `SourceInfo`.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The configId.
   */
  @java.lang.Override
  public java.lang.String getConfigId() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The id of the service configuration resource.
   * This field must be specified for the server to return all fields, including
   * `SourceInfo`.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for configId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConfigIdBytes() {
    java.lang.Object ref = configId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      configId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 3;
  private int view_;
  /**
   *
   *
   * <pre>
   * Specifies which parts of the Service Config should be returned in the
   * response.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * Specifies which parts of the Service Config should be returned in the
   * response.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView getView() {
    @SuppressWarnings("deprecation")
    com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView result =
        com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.valueOf(view_);
    return result == null
        ? com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.UNRECOGNIZED
        : result;
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
    if (!getConfigIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, configId_);
    }
    if (view_
        != com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.BASIC
            .getNumber()) {
      output.writeEnum(3, view_);
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
    if (!getConfigIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, configId_);
    }
    if (view_
        != com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.BASIC
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, view_);
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.GetServiceConfigRequest)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.GetServiceConfigRequest other =
        (com.google.api.servicemanagement.v1.GetServiceConfigRequest) obj;

    if (!getServiceName().equals(other.getServiceName())) return false;
    if (!getConfigId().equals(other.getConfigId())) return false;
    if (view_ != other.view_) return false;
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
    hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest parseFrom(
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
      com.google.api.servicemanagement.v1.GetServiceConfigRequest prototype) {
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
   * Request message for GetServiceConfig method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.GetServiceConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.GetServiceConfigRequest)
      com.google.api.servicemanagement.v1.GetServiceConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_GetServiceConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_GetServiceConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.GetServiceConfigRequest.class,
              com.google.api.servicemanagement.v1.GetServiceConfigRequest.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.GetServiceConfigRequest.newBuilder()
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

      configId_ = "";

      view_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_GetServiceConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.GetServiceConfigRequest getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.GetServiceConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.GetServiceConfigRequest build() {
      com.google.api.servicemanagement.v1.GetServiceConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.GetServiceConfigRequest buildPartial() {
      com.google.api.servicemanagement.v1.GetServiceConfigRequest result =
          new com.google.api.servicemanagement.v1.GetServiceConfigRequest(this);
      result.serviceName_ = serviceName_;
      result.configId_ = configId_;
      result.view_ = view_;
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
      if (other instanceof com.google.api.servicemanagement.v1.GetServiceConfigRequest) {
        return mergeFrom((com.google.api.servicemanagement.v1.GetServiceConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.GetServiceConfigRequest other) {
      if (other == com.google.api.servicemanagement.v1.GetServiceConfigRequest.getDefaultInstance())
        return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getConfigId().isEmpty()) {
        configId_ = other.configId_;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
      com.google.api.servicemanagement.v1.GetServiceConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.api.servicemanagement.v1.GetServiceConfigRequest) e.getUnfinishedMessage();
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
     * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
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
     * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
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
     * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
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
     * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
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
     * Required. The name of the service.  See the [overview](https://cloud.google.com/service-management/overview)
     * for naming requirements.  For example: `example.googleapis.com`.
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

    private java.lang.Object configId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The id of the service configuration resource.
     * This field must be specified for the server to return all fields, including
     * `SourceInfo`.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The configId.
     */
    public java.lang.String getConfigId() {
      java.lang.Object ref = configId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the service configuration resource.
     * This field must be specified for the server to return all fields, including
     * `SourceInfo`.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for configId.
     */
    public com.google.protobuf.ByteString getConfigIdBytes() {
      java.lang.Object ref = configId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        configId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the service configuration resource.
     * This field must be specified for the server to return all fields, including
     * `SourceInfo`.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      configId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the service configuration resource.
     * This field must be specified for the server to return all fields, including
     * `SourceInfo`.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {

      configId_ = getDefaultInstance().getConfigId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The id of the service configuration resource.
     * This field must be specified for the server to return all fields, including
     * `SourceInfo`.
     * </pre>
     *
     * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      configId_ = value;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * Specifies which parts of the Service Config should be returned in the
     * response.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * Specifies which parts of the Service Config should be returned in the
     * response.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {

      view_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which parts of the Service Config should be returned in the
     * response.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView getView() {
      @SuppressWarnings("deprecation")
      com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView result =
          com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.valueOf(view_);
      return result == null
          ? com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specifies which parts of the Service Config should be returned in the
     * response.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(
        com.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView value) {
      if (value == null) {
        throw new NullPointerException();
      }

      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies which parts of the Service Config should be returned in the
     * response.
     * </pre>
     *
     * <code>.google.api.servicemanagement.v1.GetServiceConfigRequest.ConfigView view = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {

      view_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.GetServiceConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.GetServiceConfigRequest)
  private static final com.google.api.servicemanagement.v1.GetServiceConfigRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.GetServiceConfigRequest();
  }

  public static com.google.api.servicemanagement.v1.GetServiceConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetServiceConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetServiceConfigRequest>() {
        @java.lang.Override
        public GetServiceConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetServiceConfigRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetServiceConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetServiceConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.GetServiceConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
