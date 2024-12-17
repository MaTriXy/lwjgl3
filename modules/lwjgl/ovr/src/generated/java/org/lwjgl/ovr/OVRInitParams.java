/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ovrInitParams {
 *     uint32_t Flags;
 *     uint32_t RequestedMinorVersion;
 *     {@link OVRLogCallbackI ovrLogCallback} LogCallback;
 *     uintptr_t UserData;
 *     uint32_t ConnectionTimeoutMS;
 * }}</pre>
 */
@NativeType("struct ovrInitParams")
public class OVRInitParams extends Struct<OVRInitParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        REQUESTEDMINORVERSION,
        LOGCALLBACK,
        USERDATA,
        CONNECTIONTIMEOUTMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        REQUESTEDMINORVERSION = layout.offsetof(1);
        LOGCALLBACK = layout.offsetof(2);
        USERDATA = layout.offsetof(3);
        CONNECTIONTIMEOUTMS = layout.offsetof(4);
    }

    protected OVRInitParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRInitParams create(long address, @Nullable ByteBuffer container) {
        return new OVRInitParams(address, container);
    }

    /**
     * Creates a {@code OVRInitParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRInitParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Flags} field. */
    @NativeType("uint32_t")
    public int Flags() { return nFlags(address()); }
    /** @return the value of the {@code RequestedMinorVersion} field. */
    @NativeType("uint32_t")
    public int RequestedMinorVersion() { return nRequestedMinorVersion(address()); }
    /** @return the value of the {@code LogCallback} field. */
    @NativeType("ovrLogCallback")
    public @Nullable OVRLogCallback LogCallback() { return nLogCallback(address()); }
    /** @return the value of the {@code UserData} field. */
    @NativeType("uintptr_t")
    public long UserData() { return nUserData(address()); }
    /** @return the value of the {@code ConnectionTimeoutMS} field. */
    @NativeType("uint32_t")
    public int ConnectionTimeoutMS() { return nConnectionTimeoutMS(address()); }

    /** Sets the specified value to the {@code Flags} field. */
    public OVRInitParams Flags(@NativeType("uint32_t") int value) { nFlags(address(), value); return this; }
    /** Sets the specified value to the {@code RequestedMinorVersion} field. */
    public OVRInitParams RequestedMinorVersion(@NativeType("uint32_t") int value) { nRequestedMinorVersion(address(), value); return this; }
    /** Sets the specified value to the {@code LogCallback} field. */
    public OVRInitParams LogCallback(@Nullable @NativeType("ovrLogCallback") OVRLogCallbackI value) { nLogCallback(address(), value); return this; }
    /** Sets the specified value to the {@code UserData} field. */
    public OVRInitParams UserData(@NativeType("uintptr_t") long value) { nUserData(address(), value); return this; }
    /** Sets the specified value to the {@code ConnectionTimeoutMS} field. */
    public OVRInitParams ConnectionTimeoutMS(@NativeType("uint32_t") int value) { nConnectionTimeoutMS(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRInitParams set(
        int Flags,
        int RequestedMinorVersion,
        OVRLogCallbackI LogCallback,
        long UserData,
        int ConnectionTimeoutMS
    ) {
        Flags(Flags);
        RequestedMinorVersion(RequestedMinorVersion);
        LogCallback(LogCallback);
        UserData(UserData);
        ConnectionTimeoutMS(ConnectionTimeoutMS);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRInitParams set(OVRInitParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRInitParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRInitParams malloc() {
        return new OVRInitParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRInitParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRInitParams calloc() {
        return new OVRInitParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRInitParams} instance allocated with {@link BufferUtils}. */
    public static OVRInitParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRInitParams(memAddress(container), container);
    }

    /** Returns a new {@code OVRInitParams} instance for the specified memory address. */
    public static OVRInitParams create(long address) {
        return new OVRInitParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OVRInitParams createSafe(long address) {
        return address == NULL ? null : new OVRInitParams(address, null);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRInitParams mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRInitParams callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRInitParams mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRInitParams callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code OVRInitParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInitParams malloc(MemoryStack stack) {
        return new OVRInitParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRInitParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRInitParams calloc(MemoryStack stack) {
        return new OVRInitParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Flags}. */
    public static int nFlags(long struct) { return memGetInt(struct + OVRInitParams.FLAGS); }
    /** Unsafe version of {@link #RequestedMinorVersion}. */
    public static int nRequestedMinorVersion(long struct) { return memGetInt(struct + OVRInitParams.REQUESTEDMINORVERSION); }
    /** Unsafe version of {@link #LogCallback}. */
    public static @Nullable OVRLogCallback nLogCallback(long struct) { return OVRLogCallback.createSafe(memGetAddress(struct + OVRInitParams.LOGCALLBACK)); }
    /** Unsafe version of {@link #UserData}. */
    public static long nUserData(long struct) { return memGetAddress(struct + OVRInitParams.USERDATA); }
    /** Unsafe version of {@link #ConnectionTimeoutMS}. */
    public static int nConnectionTimeoutMS(long struct) { return memGetInt(struct + OVRInitParams.CONNECTIONTIMEOUTMS); }

    /** Unsafe version of {@link #Flags(int) Flags}. */
    public static void nFlags(long struct, int value) { memPutInt(struct + OVRInitParams.FLAGS, value); }
    /** Unsafe version of {@link #RequestedMinorVersion(int) RequestedMinorVersion}. */
    public static void nRequestedMinorVersion(long struct, int value) { memPutInt(struct + OVRInitParams.REQUESTEDMINORVERSION, value); }
    /** Unsafe version of {@link #LogCallback(OVRLogCallbackI) LogCallback}. */
    public static void nLogCallback(long struct, @Nullable OVRLogCallbackI value) { memPutAddress(struct + OVRInitParams.LOGCALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #UserData(long) UserData}. */
    public static void nUserData(long struct, long value) { memPutAddress(struct + OVRInitParams.USERDATA, value); }
    /** Unsafe version of {@link #ConnectionTimeoutMS(int) ConnectionTimeoutMS}. */
    public static void nConnectionTimeoutMS(long struct, int value) { memPutInt(struct + OVRInitParams.CONNECTIONTIMEOUTMS, value); }

}