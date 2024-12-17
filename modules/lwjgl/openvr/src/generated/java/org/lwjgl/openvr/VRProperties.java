/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRProperties {

    protected VRProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRProperties_ReadPropertyBatch ] ---

    /** {@code ETrackedPropertyError VRProperties_ReadPropertyBatch(PropertyContainerHandle_t ulContainerHandle, PropertyRead_t * pBatch, uint32_t unBatchEntryCount)} */
    public static int nVRProperties_ReadPropertyBatch(long ulContainerHandle, long pBatch, int unBatchEntryCount) {
        long __functionAddress = OpenVR.VRProperties.ReadPropertyBatch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulContainerHandle, pBatch, unBatchEntryCount, __functionAddress);
    }

    /** {@code ETrackedPropertyError VRProperties_ReadPropertyBatch(PropertyContainerHandle_t ulContainerHandle, PropertyRead_t * pBatch, uint32_t unBatchEntryCount)} */
    @NativeType("ETrackedPropertyError")
    public static int VRProperties_ReadPropertyBatch(@NativeType("PropertyContainerHandle_t") long ulContainerHandle, @NativeType("PropertyRead_t *") PropertyRead.Buffer pBatch) {
        return nVRProperties_ReadPropertyBatch(ulContainerHandle, pBatch.address(), pBatch.remaining());
    }

    // --- [ VRProperties_WritePropertyBatch ] ---

    /** {@code ETrackedPropertyError VRProperties_WritePropertyBatch(PropertyContainerHandle_t ulContainerHandle, PropertyWrite_t * pBatch, uint32_t unBatchEntryCount)} */
    public static int nVRProperties_WritePropertyBatch(long ulContainerHandle, long pBatch, int unBatchEntryCount) {
        long __functionAddress = OpenVR.VRProperties.WritePropertyBatch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulContainerHandle, pBatch, unBatchEntryCount, __functionAddress);
    }

    /** {@code ETrackedPropertyError VRProperties_WritePropertyBatch(PropertyContainerHandle_t ulContainerHandle, PropertyWrite_t * pBatch, uint32_t unBatchEntryCount)} */
    @NativeType("ETrackedPropertyError")
    public static int VRProperties_WritePropertyBatch(@NativeType("PropertyContainerHandle_t") long ulContainerHandle, @NativeType("PropertyWrite_t *") PropertyWrite.Buffer pBatch) {
        return nVRProperties_WritePropertyBatch(ulContainerHandle, pBatch.address(), pBatch.remaining());
    }

    // --- [ VRProperties_GetPropErrorNameFromEnum ] ---

    /** {@code char * VRProperties_GetPropErrorNameFromEnum(ETrackedPropertyError error)} */
    public static long nVRProperties_GetPropErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VRProperties.GetPropErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /** {@code char * VRProperties_GetPropErrorNameFromEnum(ETrackedPropertyError error)} */
    @NativeType("char *")
    public static @Nullable String VRProperties_GetPropErrorNameFromEnum(@NativeType("ETrackedPropertyError") int error) {
        long __result = nVRProperties_GetPropErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VRProperties_TrackedDeviceToPropertyContainer ] ---

    /** {@code PropertyContainerHandle_t VRProperties_TrackedDeviceToPropertyContainer(TrackedDeviceIndex_t nDevice)} */
    @NativeType("PropertyContainerHandle_t")
    public static long VRProperties_TrackedDeviceToPropertyContainer(@NativeType("TrackedDeviceIndex_t") int nDevice) {
        long __functionAddress = OpenVR.VRProperties.TrackedDeviceToPropertyContainer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJ(nDevice, __functionAddress);
    }

}